@games
Business Need:
  Feature: Play games
  Background:
    Given user opens url
    When user gets the title of the page
    When  user click on sign in button
    When  user enters the user id
    And   user enters the password
    And   click on Login button
    When user Open Games page
    When user Open Diggi Games page

  Scenario: 1 Launch Candy Cane Cash game in TRY mode with reveal all.
    Then user click on "Candy Cane Cash" game on "Try" mode
    Then user click on "OK settings option" btn
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    #Then user scroll down "Ok settings option" btn
    Then user scroll down
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    #Then user scroll UP "Home" btn
    Then user scroll up
    Then user click on "Home" btn

  Scenario: 2 Launch Candy Cane Cash game in TRY mode with manual reveal.
    Then user click on "Candy Cane Cash" game on "Try" mode
    Then user click on "Settings" btn
    Then user click on "Right Arrow" btn
    #Then user scroll down "Ok settings option" btn
    Then user scroll down
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "mreveal1" btn
    Then user click on "mreveal2" btn
    Then user click on "Reveall" btn
    #Then user scroll UP "Home" btn
    Then user scroll up
    Then user click on "Home" btn

  Scenario: 3 Launch Candy Cane Cash game in TRY mode with increase/decrease.
    Then user click on "Candy Cane Cash" game on "Try" mode
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    #Then user scroll down "Ok settings option" btn
    Then user scroll down
    Then user click on "Ok settings option" btn
    Then user click on "Increase bet" btn
    Then user click on "Decrease bet" btn
    Then user click on "Increase bet" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    #Then user scroll UP "Home" btn
    Then user scroll up
    Then user click on "Home" btn

  Scenario: 4 Launch Candy Cane Cash game in BUY mode with reveal all.
    Then user click on "Candy Cane Cash" game on "Buy" mode
    Then user click on "Settings" btn
   # Then user scroll down "Ok settings option" btn
    Then user scroll down
    Then user click on "Ok settings option" btn
    Then user click on "Buy" btn
    Then user click on "Reveall" btn waiting 40 seconds
    #Then user scroll UP "Home" btn
    Then user scroll up
    Then user click on "Home" btn

  Scenario: 5 Launch Candy Cane Cash game in BUY mode with unfinished game.
    Then user click on "Candy Cane Cash" game on "Buy" mode
    Then user click on "Settings" btn
    #Then user scroll down "Ok settings option" btn
    Then user scroll down
    Then user click on "Ok settings option" btn
    Then user click on "Buy" btn
    #Then user scroll UP "Home" btn
    Then user scroll up
    Then user click on "Home" btn

  Scenario: 6 Launch Candy Cane Cash game in BUY mode tp complete unfinished game.
    Then user click on "Candy Cane Cash" game on "Buy" mode
    Then user click on "Settings" btn
    #Then user scroll down "Ok settings option" btn
    Then user scroll down
    Then user click on "Ok settings option" btn
    Then user click on "Reveall" btn
    #Then user scroll UP "Home" btn
    Then user scroll up
    Then user click on "Home" btn

  @ignore
  Scenario: 7
    When user click on "Yuletide Treasure" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 120 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Increase bet" btn
    Then user click on "Decrease bet" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn


  @ignore
  Scenario: 1 Launch game Sports Spectacular
    Then user click on "Sports Spectacular" game on "Try" mode
    Then user click on "Volume settings" btn waiting 130 seconds
    Then user click on "Ok settings option" btn
    Then user click on "Increase bet" btn
    Then user click on "Decrease bet" btn
    Then user click on "Try" btn
    Then user click on "AutoSpin" btn
    Then user click on "Home" btn

@ignore
  Scenario: 2 Launch game Thoroughbred Bucks
    Then user click on "Thoroughbred Bucks" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 160 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn
    #Then user views "Lobby"

  @ignore
  Scenario: 3 Launch game The Wild Life Clusters
    Then user click on "The Wild Life Clusters" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Home" btn

  @ignore
  Scenario: 4 Launch game Arcade Riches Pinball
    Then user click on "Arcade Riches Pinball" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn


  #Scenario:Play game in logged in try mode
    #Given user opens url
    #When user gets the title of the page
  @ignore
  Scenario: 5
    Then user click on "Hog Heist" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn

    #Then user click on "The Wild Life Clusters" game on "Try" mode
    #Then user click on "StartScreen game" btn waiting 70 seconds
    #Then user click on "Settings" btn
    #Then user click on "Volume settings" btn
    #Then user click on "AllSound" btn
    #Then user click on "Ok settings option" btn
    #Then user click on "Try" btn

@ignore
  Scenario: 10
    Then user click on "5 Card Poker" game on "Try" mode
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn

  @ignore
  Scenario: 11
    Then user click on "50x The Money" game on "Try" mode
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn

  @ignore
  Scenario: 12
    Then user click on "Color Word Match" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn

  @ignore
  Scenario: 13
    Then user click on "Safe Stash WLA" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn

  @ignore
  Scenario: 14
    Then user click on "Gold Blast" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn

  @ignore
  Scenario: 15
    Then user click on "Celtic Coins" game on "Try" mode
    Then user click on "StartScreen game" btn waiting 70 seconds
    Then user click on "Settings" btn
    Then user click on "Volume settings" btn
    Then user click on "Switch off volume" btn
    Then user click on "Ok settings option" btn
    Then user click on "Try" btn
    Then user click on "Reveall" btn
    Then user click on "Home" btn



