void main(){
  final result = greet('name', 10);
  final result2 = greetx(age:10, name:"yourname" );
  print(result2);
}

String greet(String name,int age){
  return 'Hello, $name! You are $age years old.';
}

String greetx({String? name,required int age}){
  return 'Hello, $name! You are $age years old.';
}