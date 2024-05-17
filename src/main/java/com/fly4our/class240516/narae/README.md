# Arrays of objects
## simple quiz

1. String[] names = new String[10]
   Which of the following statements puts a reference to the String "Hello" in the last cell of the array?

-[ ] A. names[0] = "Hello";
-[ ] B. names[10] = "Hello";
-[ ] C. names[9] = "Hello";
-[ ] D. String[ names.length-1 ] = "Hello";

2. String[] names = new String[10];
   and that further statements (not shown) have put String references into some of the cells.
   Which of the following fragments prints out every String, but skips null references?
-[ ] A. 
for (int j = 0; names[j] != null; j++) <br/>
System.out.println(names[j]);
-[ ] B.
for (int j = 0; j < names.length; j++) <br/>
System.out.println(names[j]);
-[ ] C.
for (int j = 0; j < names.length; j++) <br/>
System.out.println(names[j]);
-[ ] D.
for (int j = 0; j < names.length; j++) <br/>
if(names[j] != null)
System.out.println(names[j]);

