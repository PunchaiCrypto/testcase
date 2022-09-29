package com.akepunchai.CRUD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@SpringBootTest
class CrudApplicationTests {

	FizzBuzz i = new FizzBuzz();
	findPrimeNum x = new findPrimeNum();

	finonaci f = new finonaci();

	//Test number if divine by 3 and 5
	@Test
	public void DivineBy5() {
		assertThat(i.FizzBuzz(5), is("Buzz"));
	}
	@Test
	public void DivineBy3() {
		assertThat(i.FizzBuzz(3), is("Fizz"));
	}
	@Test
	public void DivineBy3And5() {
		assertThat(i.FizzBuzz(15), is("FizzBuzz"));
	}
	@Test
	public void NotDivineBy3And5() {
		assertThat(i.FizzBuzz(1), containsString("1"));
	}

	//Test Prime value
	@Test
	public void PrimeNumValue0() {
		assertThat(x.primenum(0), is(false));
	}
	@Test
	public void PrimeNumValueLower2() {
		assertThat(x.primenum(1), is(false));
	}
	@Test
	public void PrimeNumValue2() {
		assertThat(x.primenum(1), notNullValue());
	}
	@Test
	public void PrimeNumValueOver2NotPrime() {
		assertThat(x.primenum(10), is(false));
	}
	@Test
	public void PrimeNumValueOver2Prime() {
		assertThat(x.primenum(7), is(true));
	}
	@Test
	public void PrimeNumValueNegative() {
		assertThat(x.primenum(-7), is(false));
	}

	//Test Fibonacci function
	@Test
	public void NormalValue(){assertThat(f.FibonacciV2(1),is(0));}
	@Test
	public void ValueLowerThan1(){assertThat(f.FibonacciV2(-1),is(0));}
	@Test
	public void RandomValue(){assertThat(f.FibonacciV2(7),is(8));}

}
