@echo off
set path=C:\Users\AmrElGazzarM\.m2\repository\allure\allure-2.17.3\bin;C:\Users\AmrElGazzarM\.jdks\openjdk-17.0.1\bin;%path%
allure serve allure-results
pause
exit