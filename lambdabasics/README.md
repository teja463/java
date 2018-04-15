## Lambda Expressions
- Lambda expressions are not anonymous inner classes. In other languages like Scala and Groovy, they provide lambda expressions. What they do is they just replace the lambda expressions with the anonymous inner classes.
- So when you look inside the classes folder for those java files you will see so many classes with $1 that the anonymous inner class files are created.
- The problem with this approach is the jar file becomes heavy with all those class files and Memory foot print also increase because JVM needs to load all those classes.
- In java 8 Lambdas are not Anonymous inner classes they are **invokedyamic** functions.
- That is the reason when you print out `this` object in any of the lambda methods it will be the same reference of the class it belongs to.

## Method references
- You can use method references in lambdas when you don't modify the input and you are just passing the value you receive as it is to another method.
- In those cases you can use method references

```Java

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		numbers.forEach(e -> System.out.println(e));
		
		numbers.forEach(System.out::println);
```    
- If you see the above two statements you are just taking `e` and passing it to `println` method. In those scenarios you can use Method references

## Streams
- If you see the collections like Map, List, Set, they are represent data. They contain the data.
- Streams are abstraction they do not contain the data.

### Filter
- Used to filter the data in the streams.
- Filter works only on its swim lanes that is they take a input apply the conditions and decides to pass the value through or not.
- Filters take `Predicate<T>` as input and uses test method to apply the filter condition.
```Java

	numbers.stream().filter(e -> e % 2 == 0); // Filtering out odd elements in the list
	
``` 

### Map
- Used to manipulate the data in the streams.
- Number of inputs = number of outputs
- Map also works only on its swim lanes. Takes an input transforms it to another value.
- Map takes  `Function<T, R>` as input and returns `Stream<R>` as output. Here is value `T` is transformed into value `R`
```Java
	
	numbers.stream().filter(e -> e%2 == 0).map(e -> e * 2); // Doubling the value of each element in the list
```

### Reduce
- Used to reduce the list into a sum or any other output
- Reduce cuts arcoss swim lanes.
- It takes to parameters first is of type `T` and second is of BiFunction<R, T, R> produces result of R
- Here first R is the output of the previous map and T is the input of current value and R is the return value which will go as again input to the next round

```Java

	Double sumOfint = numbers.stream().filter(e -> e %2 == 0).map(e -> e * 2.0).reduce(0.0, (carry, ret) -> carry + ret);

```
- There are also some specialized reducers like `sum`, `count` etc.

### Collectors
- Used when you want to collect the output to a List or Set or Map.
- Use can also you `groupingBy` in Collectors to group by.

### Streams Lazy evaluation
- Unless you use the terminal operator your stream will not be execuated.
- Lets say you used the code `numbers.stream().filter(Sample::isEven).map(Sample::doulbeIt)`. In this case compiler will not execute any of those Sample::methods. Because here you just built a stream, you did not tell what to do. So the JVM just builds the stream and does not execute it.
- Now when you say  `numbers.stream().filter(Sample::isEven).map(Sample::doulbeIt).findFirst()`, here you want to find the first element so the JVM runs the stream.
- You can find out whether a function is lazy evaluation. If a function returns Stream object then it is lazy other wise it is the terminal function.

### Stream Characteristics
- Sized, Orderd, distinct, sorted.
- You can use the `.sorted()` and `.distinct()` to make the stream sorted and distinct
### Infinite Streams
- You can do infite streams. Here find all the sum of the sqrt of the 50 even numbers and whoose sqrt is > 20 starting from 100 
```Java
	
	Streamm.iterate(100, e -> e + 1).filter(e -> e%2 == 0).filter(Math.sqrt(e) -> 20).mapToInt(e -> e * 2).limit(50).sum();
```