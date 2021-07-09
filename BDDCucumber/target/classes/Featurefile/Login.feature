Feature: CHIC Login
@Test
Scenario Outline: User try to login

Given User in login page
When Title of login in CHIC
Then Enter the "<username>"
Then Enter "<password>"
And user is on login page



Examples:
| username | password |
| chicqa_uw | chicqa1 |
| adampoller_uw | welcome1 |