# Clothing Warehouse

This program simulates a volunteer's task at a local clothing and shoe warehouse, aimed at sorting and distributing items to people in need. The optimization of gloves and shoes and the alphabetical sorting of the list are the key functionalities addressed in this code.

## Input Data

Reads from the console.
- The first line contains the number N, indicating the number of input lines to follow.
- The next N lines consist of brand names.

## Output Data

Prints to the console.
- Prints each unique brand on a new line in the following format: `{brand} {quantities} {even number?}`

### Limits
- 1 <= N <= 1000
- Each name contains only letters and numbers.
- All brand names are unique.

## Sample Tests

### Input

6
Hudson
Nine West
Elemis
Imusa
Tom Ford
Nine West

### Output

Elemis 1 No
Hudson 1 No
Imusa 1 No
Nine West 2 Yes
Tom Ford 1 No
