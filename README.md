# Optimizing top-k High Utility Itemsets Mining for Massive Datasets

## by Ha Minh Khoa - ITITIU19020

## Overview
This project aims to provide improvements to the exisiting top-k High Utility Itemsets Mining algorithm with the hope that it will perform better when mining high utility itemsets on **Massive Datasets**.

## Related work
This project is based on the existing top-k High Utility Items: [Xixian Han, Xianmin Liu, Jianzhong Li, Hong Gao, “Efficient top-k high utility itemset mining on massive data”, Information Sciences, vol. 557, Pages 382-406, 2021, ISSN 0020-0255](https://www.sciencedirect.com/science/article/abs/pii/S0020025520307921).

Additionally, this project also includes works from the following list:
1. [S.Zida, P.Fournier-Viger, J.C.W.Lin, C.W.Wu, and V.S.Tseng, “EFIM: a fast and memory efficient algorithm for high-utility itemset mining,” Knowledge and Information Systems, vol.51, no.2, pp.595–625, May 2017, doi:10.1007/s10115-016-0986-0](https://www.philippe-fournier-viger.com/spmf/MICAI2015_EFIM_High_Utility_Itemset_Mining.pdf).
2. [How to Sort a Large File by algosome.com](https://www.algosome.com/articles/how-to-sort-large-file.html).

## Guidelines

1. Download and install the latest version of java JDK from the [official website](https://www.oracle.com/java/technologies/downloads/).

2. Download and install Visual Studio Code from the [official website](https://code.visualstudio.com/download).

3. Install the extension to compile and run Java in VS Code. [I am using Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java).

4. Clone the repository or download the project folder provided.

5. Open folder "New\spmf\ca\pfv\spmf". In this folder, there will be 6 main components: algorithms, projectedDB, tempStorage, test, Test_Data and tools:
    -   algorithms: Contains the main code for this project
    -   projectedDB: Keeps the projected partitions during the mining process
    -   tempStorage: Stores the temporary files for the external sorting process
    -   test: Constains the main function and 1 test database
    -   Test_Data: Stores all the selected databases used for testing in this project
    -   tools: Contains the tools to measure time and memory usage







