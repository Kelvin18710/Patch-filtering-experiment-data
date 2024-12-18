# 补丁生成工具🛠️

此工具用于比对两个文件夹中的文件差异，生成对应的补丁文件。原始文件夹和修改版本文件夹的结构应具有一定的相似性，脚本将自动递归查找文件，并在修改版本中找到对应的文件生成补丁。

## 文件组织结构

### 1. 原始文件夹 (`origin_folder`)
`origin_folder` 目录包含原始版本的文件。每个子目录（如 `Lang_4`）代表一个项目或模块，并且每个子目录下的文件将与修改版本中的文件进行对比。

- `origin_folder` 下的结构示例：
  ```
  origin/
    ├── Lang_4/
    │   └── Lang_4.java
    └── Lang_5/
        └── Lang_5.java
  ```

### 2. 修改版本文件夹 (`patched_folder`)
`patched_folder` 目录包含修改版本的文件。在该目录下，文件夹结构有两层，外层目录代表项目或模块（如 `Lang_4`），内层目录代表不同的修改版本（如 `Lang_4_a`, `Lang_4_b`）。每个内层目录下的文件将与 `origin_folder` 中相应的文件进行对比，生成补丁，注意Lang_4_a这一级目录下可以包含多层子目录，但要保证整个Lang_4_a中只有一个java文件。

- `patched_folder` 下的结构示例：
  ```
  source/
    ├── Lang_4/
    │   ├── Lang_4_a/
    │   │   └── xxx.java
    │   └── Lang_4_b/
    │       └── xxx.java
    └── Lang_5/
        ├── Lang_5_a/
        │   └── xxx.java
        └── Lang_5_b/
            └── xxx.java
  ```

### 3. 输出补丁文件夹 (`output_folder`)
`output_folder` 用于存放生成的补丁文件。每个补丁文件的命名格式为 `patch_{inner_dir}(p).patch`，其中 `inner_dir` 是修改版本的子目录名称（如 `Lang_4_a`, `Lang_4_b`）。补丁文件将保存每个修改版本与原始版本之间的差异。

- `output_folder` 下的结构示例：
  ```
  generated_patches/
    ├── patch_Lang-4-a.patch
    └── patch_Lang-4-b.patch
  ```

## 使用方法

### 1. 安装依赖

依赖 Python 标准库中的 `os` 和 `difflib` 模块，所以不用额外安装了

### 2. 配置目录

根据实际情况设置以下目录路径：

- `origin_folder`: 存放原始版本文件的目录路径。
- `patched_folder`: 存放修改版本文件的目录路径。
- `output_folder`: 存放生成补丁文件的目录路径。

例如，可以设置如下路径：

```python
origin_folder = './origin/'  # 原始版本文件的根目录
patched_folder = './source/'  # 修改版本文件的根目录（可以包含多层目录）
output_folder = './generated_patches/'  # 存放补丁的输出文件夹
```

### 3. 运行脚本

配置好目录路径后，直接运行脚本。脚本将递归遍历 `patched_folder` 下的子目录，查找并生成补丁文件，保存至 `output_folder` 中。

```bash
python generate_patch.py
```
目录中设置了一组Lang_6的示例，可以对照使用

