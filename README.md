# testng-test-suite

## Testing Locally

+ Uncomment the Part 1 in `BrowserStackTestNGTest.java` and comment-out Part 2

+ To run the single local test, run `mvn test -P single-local`

## Tests on BrowserStack

### Single Tests
- To run the single test, run `mvn test -P single-chrome`

- To run the single test, run `mvn test -P single-safari`

- To run the single test, run `mvn test -P single-firefox`

- To run the single test, run `mvn test -P single-ie`

- To run the single test, run `mvn test -P single-android-chrome`

- To run the single test, run `mvn test -P single-ios-safari`

### Singles Tests Combined
- To run the single test, run `mvn test -P combined`

### Parallel Test
- To run the single test, run `mvn test -P parallel`

### Single Test plus Parallel (Combined)
- To run the single test, run `mvn test -P checkout`

- To run the single test, run `mvn test -P single`
