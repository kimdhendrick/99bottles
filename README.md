# 99bottles

## Setup

1. [Install gradle](https://gradle.org/install/)

`> brew install gradle`

2. Install git pair

`> gem install pivotal_git_scripts`

## Run Tests

`> gradle test`

## Questionable Listings

### Listing 2.16: Verse Case Statement Else Branch
Skipped listing because no code change

### Listing 2.22: Shameless Green Initial
Skipped listing because no code change

### Listing 2.23: No Song Test
Skipped listing because no code change

### Listing 2.28: Shameless Green
Skipped listing because no code change

### Listing 3.1: Shameless Green
Skipped listing because no code change

### Listing 3.4: Verse Method Conditional
Skipped listing because no code change

### Listing 3.5: 2 and Else Case
Skipped listing because no code change

### Listing 3.7: One Difference Remains
Skipped listing because no code change

### Listing 3.10: One Difference Remains Redux
Skipped listing because no code change

### Listing 4.1: 3 Branch Case Statement
Skipped listing because no code change

### Listing 4.2: 1 and Else, 1st Phrases Differ
Skipped listing because no code change

### Listing 4.5: 1 and Else, 2nd Phrases Differ
Skipped listing because no code change

### Listing 4.7: 1 and Else, 3rd Phrases Differ
Skipped listing because no code change

### Listing 4.16: 1 and Else, 4th Phrases Differ
Skipped listing because no code change

### Listing 4.21: Quantity Message With Conditional
We had to return `number` as a `String` which will cause problems later with the Liskov Substitution Principle.

### Listing 4.22: Using the Number Default From the 1 Case
Skipped listing because no code change

### Listing 4.29: 1 and Else Cases More Alike
Skipped listing because no code change

### Listing 4.32: 0 and Else Cases Differ
Skipped listing because no code change

### Listing 4.34: Quantity Capitalized in Else Case
This does not cause the tests to fail because we had to return a `String` back in Listing 4.21 because of Java's strong typing.

### Listing 4.35: Quantity Method Reprise
Same comment as Listing 4.34

### Listing 4.36: Else Branch Converts Result
Same comment as Listing 4.34

### Listing 4.37: Both Branches Convert Result
Same comment as Listing 4.34

### Listing 4.38: Quantity Obeys Liskov
Same comment as Listing 4.34

### Listing 4.39: Verse Trusts Quantity
Same comment as Listing 4.34

### Listing 4.21-4.39:
We had to improvise on master because Java's strong typing doesn't allow us to return both a number and a string from the same method. This makes LSP hard to demonstrate here. We created an alternate path on branch `listing-4.20-quantity-with-liskov`, but it is unlikely that any Java programmer in his/her right mind would ever follow that path. :D

### Listing 4.41: 0 and Else, 2nd Phrases Differ
Skipped listing because no code change

### Listing 4.43: Phrases 1 and 2 Are Identical
Skipped listing because no code change

### Listing 4.44: 0 and Else, 3rd Phrases Differ
Skipped listing because no code change

### Listing 4.47: Phrases 1, 2, and 3 Are Identical
Skipped listing because no code change

### Listing 4.50: Song and Verses Reprise
Skipped listing because no code change

### Listing 4.51: Case 0 Handles Restart
Skipped listing because no code change

### Listing 4.59: Identical 0 and Else Cases
Skipped listing because no code change

### Listing 4.60: Using the Same Template for Every Verse
Java didn't allow us to do another explicit return after the case statement so we replaced the entire case statement at this point.

### Listing 4.61: Final Listing
Skipped listing because no code change

### Listing 5.1: DRY Bottles Class
Skipped listing because no code change

### Listing 5.4: Song Method
Skipped listing because no code change

### Listing 5.5: Verses Method
Skipped listing because no code change

### Listing 5.6: Verse Method
Skipped listing because no code change

### Listing 5.7: Flocked Five Conditional Tests
Skipped listing because no code change

### Listing 5.15: Redundant Arguments
Skipped listing because no code change

### Listing 5.16: BottleNumber Container Redux
Skipped listing because no code change

### Listing 5.18: Forward With Redundant Arguments
Skipped listing because no code change

### Listing 5.21: Forward Messages to Smarter Number
Skipped listing because no code change

### Listing 5.22: Lots of New BottleNumbers
Skipped listing because no code change

### Listing 5.26: Current Phrase 4
Skipped listing because no code change

### Listing 6.1: Quantity and Container Form a Data Clump
Skipped listing because no code change

### Listing 6.5: BottleNumber
Skipped listing because no code change

### Listing 6.6: Original Container Method Takes Number Argument
Skipped because it matches Listing 4.61

### Listing 6.9: BottleNumber Conditional Shape
Skipped listing because no code change

### Listing 6.10: BottleNumber Concepts
Skipped listing because no code change

### Listing 6.14: Verse Method Knows BottleNumber Class Name
Skipped listing because no code change

### Listing 6.18: If Statements Return Objects
If statements are not expressions in Java so we are not able to extract the `new` out of the if statement.

### Listing 6.20: BottleNumber0 With Duplicated Quantity Method
Skipped because it matches Listing 6.12

### Listing 6.21: Factory Chooses Polymorphic Object
Skipped because it matches Listing 6.19

### Listing 6.29: Shameless Green Conditional
Skipped because it matches Listing 3.3

### Listing 6.30: Factory Conditional
Skipped because it matches Listing 6.28

### Listing 6.32: All About Successor
Skipped listing because no code change