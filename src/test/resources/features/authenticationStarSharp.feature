# Autor: Andres Felipe Ocaña Ortega
@stories
Feature: StarSharp app
  As a user, I want to be able to create a business unit and schedule a new meeting
  @scenario1
  Scenario: Create a business unit
    Given than Andres wants to use the StarSharp app
    |strUsername|strPassword|
    |admin     |serenity   |

    When he creates AndresUnit on the StarSharp platform
    |strNameBusinessUnit|
    |AndresUnit         |

    Then he finds the business unit created called AndresUnit


  @scenario2

  Scenario:Schedule a new meeting
    Given than Andres wants to use the StarSharp platform
      |strUsername2|strPassword2|
      |admin     |serenity   |

    When he creates Andresmeeting
      |strNameLocation|strNamemeeting|strMeetingtype|strMeetingnumber|strMonth|strYear|strTimestardate|strMonth2|strYear2|strTimeenddate|strLocation|strUnit|strRandom|strName|strName2|strLastname|strEmail|strNamecomplete|strNamecomplete2|
      |CEOH           |Andresmeeting |General       |15              |May     |2023   |12:00          |May      |2023    |13:00         |CEOH       |AndresUnit|jbhjbj|Andres |Andres |Ocana      |anfeocor@gmail.com|Andres Ocana|Andres Ocana|

    Then he finds the new meeting called Andresmeeting
