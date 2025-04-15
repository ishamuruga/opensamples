void main(){
  final result = greet('name', 10);
  print(result);
}

greet(String name,int age){
  return 'Hello, $name! You are $age years old.';
}