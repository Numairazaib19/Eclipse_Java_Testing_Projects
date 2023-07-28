Feature: BellyFeature
  #True Scenario
  Scenario: eaten many cukes and wait 2 and growl
    Given I have eaten 42 cukes
    When I wait 2 hour
    Then my belly should growl
  #True Scenario
  Scenario: eaten few cukes and not growl
    Given I have eaten 3 cukes
    When I wait 2 hour
    Then my belly should not growl

  #False Scenario
  Scenario: eaten many cukes and not growl
    Given I have eaten 20 cukes
    When I wait 1 hour
    Then my belly should not growl