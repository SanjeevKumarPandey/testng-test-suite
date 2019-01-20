# testng-test-suite

## Testing Locally

+ Uncomment the Part 1 in `BrowserStackTestNGTest.java` and comment-out Part 2

+ Run `mvn test -P single-local`

## Tests on BrowserStack:

### Single Tests
- To run the single test (uses Chrome), run `mvn test -P single`

- To run the single test for *Chrome*, run `mvn test -P single-chrome`

- To run the single test for *Safari*, run `mvn test -P single-safari`

- To run the single test for *Firefox*, run `mvn test -P single-firefox`

- To run the single test for *IE*, run `mvn test -P single-ie`

- To run the single test for *Android Chrome*, run `mvn test -P single-android-chrome`

- To run the single test for *iOS Safari*, run `mvn test -P single-ios-safari`

### Parallel Test
- To run the parallel test, run `mvn test -P parallel`

### Combined Tests:

**Singles Tests Combined**
- To run the all single tests together, run `mvn test -P combined`

**Single Test plus Parallel Combined**
- To run the single test combined with the parallel one, run `mvn test -P checkout`
