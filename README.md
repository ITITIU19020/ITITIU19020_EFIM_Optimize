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

3. Install the extension to compile and run Java in VS Code. [I recommend using using Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java).

4. Clone the repository or download the provided project folder.

5. Open the folder New\spmf\ca\pfv\spmf. In this folder, you will find six main components:

   - algorithms: Contains the main code for this project.
   - projectedDB: Keeps the projected partitions during the mining process.
   - tempStorage: Stores the temporary files for the external sorting process.
   - test: Contains the main function and one test database.
   - Test_Data: Stores all the selected databases used for testing in this project.
   - tools: Contains the tools to measure time and memory usage.

6. Open the folder New\spmf\ca\pfv\spmf\test and select the MainTestEFIM_saveToFile.java file.

7. Once the IDE finishes compiling, you can pick one of the available databases within this project. I recommend using the sample database within the same folder as the main function for the first time, as it is smaller and easier to run than the databases in the "Test_Data" folder.

8. After that, you can change the value of the input string in the main function to the location of the selected database. For example, if you want to run the program on the "chainstore" database in the "Test_Data" folder, change the input string to New\\spmf\\ca\\pfv\\spmf\\Test_Data\\chainstore.txt.
   **Notice**: If you are cloning from the github link, the last 3 databases SUSY, SUSY x 2 and SUSY x 3 are over the limit on git, there will be a link to a [google drive link](https://drive.google.com/file/d/1rbUZB0a2vVpI9uqD8JEiCcg5FpVcyesb/view?usp=sharing) containing all the databases used in this project for download. Otherwise, the project folder provided already contains the required databases.

9. Next, you can adjust the k value within the main function to your desired value. Note: As the k value increases, the algorithm takes more time to extract the required k itemsets. Therefore, I recommend choosing a small k value, such as 5, 10, or 15, for initial testing.

10. Once you've made your adjustments, you can press "Start Debugging" in the "Run" tab in VS Code, or press "Run" at the top of your main function provided by the extension.

11. Finally, you can gather the results shown in the terminal. The required itemsets will be stored in the file output.txt.

## Support

Please enter an issue in the repo for any questions or problems.
Alternatively, you can contact us at ititiu19020@student.hcmiu.edu.vn.
