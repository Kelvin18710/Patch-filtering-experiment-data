# Patch-filtering-experiment-data


## 文件结构
Patch-filtering-experiment-data/ ├── exp1/ │ ├── data/ │ │ ├── Lang_13/ │ │ │ ├── patch/ # 自动生成的补丁 │ │ │ ├── testsuite/ # 生成的测试用例数据 │ │ │ └── result/ # 测试运行结果 │ │ └── Lang_46/ │ │ ├── patch/ │ │ ├── testsuite/ │ │ └── result/ │ └── result/ # 实验分析表与分析结果 │ ├── analysis_table.xlsx # 分析数据表格 │ └── analysis_summary.txt # 分析结果总结 ├── exp2/ │ ├── data/ # 与 exp1 结构相同 │ └── result/ └── README.md # 本说明文件

## 关键目录说明

- **`expN/`**：每个 `expN` 目录代表一次不同的实验或项目迭代。
- **`data/`**：包含各个 Bug 的补丁、测试数据和运行结果。
  - **`patch/`**：自动生成的补丁文件，用于修复对应 Bug。
  - **`testsuite/`**：针对补丁生成的测试用例数据。
  - **`result/`**：测试用例执行的运行结果。
- **`result/`**：包含实验数据的分析表和分析结果，用于评估补丁过滤工具的效果。
  - **`analysis_table.xlsx`**：实验数据的分析表格。
  - **`analysis_summary.txt`**：实验结果的总结和关键发现。
