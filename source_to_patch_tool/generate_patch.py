import difflib
import os


def find_unique_file(directory):
    """
    在目录中递归查找唯一文件。

    :param directory: 要查找的目录路径
    :return: 文件的完整路径
    """
    for root, _, files in os.walk(directory):
        if files:
            return os.path.join(root, files[0])  # 返回找到的第一个文件
    return None  # 如果没有找到文件，返回 None


def read_file_with_fallback(file_path):
    """
    使用不同的编码尝试读取文件内容。

    :param file_path: 文件路径
    :return: 文件内容的每一行
    """
    encodings = ['utf-8', 'latin-1', 'ISO-8859-1']  # 尝试的编码列表
    for encoding in encodings:
        try:
            with open(file_path, 'r', encoding=encoding) as f:
                return f.readlines()
        except UnicodeDecodeError:
            continue
    raise UnicodeDecodeError(f"无法解码文件: {file_path}，尝试了以下编码: {encodings}")


def generate_patch_for_shared_origin(origin_folder, patched_folder, output_folder):
    """
    比对 origin 文件夹中对应的原始文件与 patched 文件夹中多层结构的唯一文件的差异，并生成补丁。

    :param origin_folder: 原始版本文件所在的文件夹路径
    :param patched_folder: 修改版本文件所在的根文件夹路径
    :param output_folder: 保存补丁文件的输出文件夹路径
    """
    try:
        # 检查输出文件夹是否存在，不存在则创建
        if not os.path.exists(output_folder):
            os.makedirs(output_folder)

        # 遍历 patched 文件夹中的第一层子目录（如 Lang_4）
        for outer_dir in os.listdir(patched_folder):
            outer_dir_path = os.path.join(patched_folder, outer_dir)
            if os.path.isdir(outer_dir_path):  # 确保是目录
                # 在 origin 文件夹中找到对应目录
                origin_dir_path = os.path.join(origin_folder, outer_dir)
                if not os.path.exists(origin_dir_path) or not os.path.isdir(origin_dir_path):
                    print(f"警告: 在 origin 文件夹中未找到对应目录 {origin_dir_path}，跳过该目录")
                    continue

                # 遍历第二层子目录（如 Lang_4_a, Lang_4_b）
                for inner_dir in os.listdir(outer_dir_path):
                    inner_dir_path = os.path.join(outer_dir_path, inner_dir)
                    if os.path.isdir(inner_dir_path):  # 确保是第二层子目录
                        # 使用第二层子目录名称作为补丁文件名
                        patch_file_name = f"patch_{inner_dir}.patch"
                        patch_file_name = patch_file_name.replace("_", "-")
                        output_patch_path = os.path.join(output_folder, patch_file_name)

                        # 在 origin/Lang_4 中递归查找唯一原始文件
                        file1_path = find_unique_file(origin_dir_path)  # 原始版本文件
                        file2_path = find_unique_file(inner_dir_path)  # 修改版本文件

                        if not file1_path or not file2_path:
                            print(f"警告: 文件缺失，跳过目录 {inner_dir}")
                            continue

                        file1_lines = read_file_with_fallback(file1_path)  # 原始版本文件内容
                        file2_lines = read_file_with_fallback(file2_path)  # 修改版本文件内容

                        diff = difflib.unified_diff(
                            file1_lines,
                            file2_lines,
                            fromfile=file1_path,
                            tofile=file2_path,
                            lineterm=''
                        )

                        # 修复空行问题的写入方式
                        with open(output_patch_path, 'w', encoding='utf-8') as patch_file:
                            patch_content = '\n'.join(line.rstrip() for line in diff)  # 移除行尾空格
                            patch_file.write(patch_content)

                        print(f"补丁生成成功: {output_patch_path}")
    except Exception as e:
        print(f"生成补丁时发生错误: {e}")


# 使用示例
origin_folder = './origin/'  # 原始版本文件的根目录
patched_folder = './source/'  # 修改版本文件的根目录（包含多层目录）
output_folder = './generated_patches/'  # 存放补丁的输出文件夹

generate_patch_for_shared_origin(origin_folder, patched_folder, output_folder)
