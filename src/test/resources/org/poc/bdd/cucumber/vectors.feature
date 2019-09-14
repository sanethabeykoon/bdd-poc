Feature: Vectors

Scenario: Vectors 01

Given Environment is set up "chrome" "https://www.physicsisbeautiful.com"
When Maximize browser window
When Wait execution "unit" 10
When Click element "id" "getStartedButton"
When Wait execution "unit" 10
When Click element "xpath" "//div[@id='react-app']//a[@href='/curriculum/modules/hKj2bCW4wbGvZqDFwUaVzL']/div"
When Wait execution "unit" 10
When Click element "xpath" "//div[@id='react-app']//a[@href='/curriculum/lessons/4nXkRtEGMqGnNvcpLDfXmV']/div"
When Wait execution "unit" 10
When Move to element "xpath" "//div[@id='react-app']/div[@class='container problem-sheet']//div[@class='canvas-container']/canvas[2]" and place pointer 10 10
When Click and hold
When Move pointer -50 0
When Release mouse
When Perform action
When Click element "id" "checkButton"
Then Verify innerText "id" "correctMessage" "Correct" "errorMessage"
Then Close browser