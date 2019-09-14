
# references

[expressions](https://concordion.github.io/concordion/latest/spec/common/command/expressions/ComplexExpressions.html)
[excel extension]()

https://github.com/concordion/concordion-excel-extension
https://github.com/concordion/concordion-excel-extension-tutorial
http://concordion.github.io/concordion-excel-extension/spec/ExcelConcordionTutorial.html


# demo / test

## ISSUE - stale html file
- eclipse build does not update

reason: html is only updated in maven build !


FIX: ALWAYS run as maven test

## use excel
ok

## Set property of bean in fixture


## multiple statements in one comment

same comment:
c:set="#A"
c:set="#B"

ERROR: 
Error parsing generated HTML:


## change concordion namespace to "c"

# FirstExcelTutorial
- original XLSX 
- works

<workbook
	xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main"
	
# Demo2 
Simple example 
format: libreoffice export of OfficeOpen XML XLSX
<workbook
	xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main"
	xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships">
	
	
OBSERVED
- result html contains input text 
- input text is wrapped in span with style display:none - so it does not get displayed

FIXED in  local build 2.1.1-SNAPSHOT

Spec outut is at:

file:///tmp/concordion/demo1/Demo2.html

Observed: no instrumentation exists

diff in ooxml structure - concordion instrumentation:
- in office original: comment/text/r[2]
- in libreoffice: comment/text/r[1]

fix libreoffice: enter a dummy row


# Demo3
example:  libreoffice saved as msoffice 2013 xlsx
- copy contents of FirstExcelTutorial 

Observed:
- same as Demo2

# NOTES

## Parser does support multiple statements per comment

syntax is just very strict

## Change namespace prefix
(html)xmlns:c='http://www.concordion.org/2007/concordion'

## Assign to property
SOL1 : FullOGNL 
c:execute='prop=#TEXT'

## Automatic conversion from String to Int
- assign to properties
- pass as method arguments


# ISSUES
## ISSUE: libreoffice uses non-standard double quotes in comments

observed in Demo2
(int)ch=8221

extension expects either ASCII single or double quotes

FIX
- use no quotes - if no whitespace
- use single quotes 
- copy/paste from text editor

## ISSUE: comment parser - incorrectly parses unquoted
- fist char of value is skipped

## ISSUE: tool is not picking up changes in excel
after save, tool picks up old data

reason: xslx is processed from target/test-classes 
Eclipse:  MUST enable auto build

control: 
- make a change in the input as witness of change 
 


## ISSUE cannot set properties
FullOGNL
concordion:set='factor'
Factor 3
Variable for concordion:set must start with '#' (i.e. change concordion:set="factor" to concordion:set="#factor".

Workaround: execute='factor=#TEXT'

## ISSUE: no great diagnostics from syntax errors
- could use a real parser...


## ISSUE assert on int is not evaluated

Probably: cannot assert on other than string

c:assertEquals='#result.ageIn10'

OBSERVED: NO assertion is made
( white background )

## ISSUE does not evaluate comment on empty cell
- CONFIRMED

## ISSUE: use non-existent variable is silently set to 0/null
This hides typos in variable names
Expect: should raise error



