# Arrays of objects
## simple quiz

1. String[] names = new String[10] <br/>
   배열의 마지막 셀에 "Hello"가 반환되는 방법은?

- [ ] A. names[0] = "Hello"; <br/>
- [ ] B. names[10] = "Hello"; <br/>
- [ ] C. names[9] = "Hello"; <br/>
- [ ] D. String[ names.length-1 ] = "Hello";

2. String[] names = new String[10];
<br/> null 참조를 건너뛰고 모든 String을 출력하는 방법은?

- [ ] A. 
for (int j = 0; names[j] != null; j++) <br/>
System.out.println(names[j]);
- [ ] B.
for (int j = 0; j < names.length; j++) <br/>
System.out.println(names[j]);
- [ ] C.
for (int j = 0; j < names.length; j++) <br/>
System.out.println(names[j]);
- [ ] D.
for (int j = 0; j < names.length; j++) <br/>
if(names[j] != null)
System.out.println(names[j]);
