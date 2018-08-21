# walletHubQAAutomation
walletHubQAAutomation 


a) How to run: -
1) Via Maven - mvn clean verify test -DTestNGFilename=WalletHubQA_Assignment1.xml | mvn clean verify test -DTestNGFilename=WalletHubQA_Assignment1.xm
2) Via TestNG - Configure IDE for WalletHubQA_Assignment1.xml or WalletHubQA_Assignment2.xml TestNG suite files and run


b) For configuring Assignment 1 (Facebook) do changes in WalletHubQA_Assignment1.xml for given parameters  : -
    <parameter name="browser" value="chrome"/>
    <parameter name="baseURL" value="https://www.facebook.com"/>
    <parameter name="userName" value="NA"/>
    <parameter name="password" value="NA"/>
    
    
c) For configuring Assignment 2 (WalletHub) do changes in WalletHubQA_Assignment2.xml for given parameters  : -
    <parameter name="browser" value="chrome"/>
    <parameter name="baseURL" value="https://wallethub.com/profile/test_insurance_company/"/>
    <parameter name="userName" value="NA"/>
    <parameter name="password" value="NA"/>
    <parameter name="review" value="Review text!"/>
    
