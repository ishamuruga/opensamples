void main() {
  print('Hello, World!');
  // print('This is my first Dart program.');
  // print('I am learning Dart for Flutter development.');
  // print('Dart is a great language for building mobile apps.');
  // print('I am excited to learn more about Dart and Flutter.');
  // print('Let\'s build something amazing together!');

  for (int i = 0; i < 5; i++) {
    print('This is iteration number $i');
  }
  print('This is the end of the program.');

  var name = "indian";
  //run time constant
  final age = 25;

  final now1 = DateTime.now(); // ✅ OK
  // const now2 = DateTime.now(); // ❌ Error: not a constant expression

  // compile time constant
  const salary = 10000;
  print('My name is $name and I am $age years old.${now1}');
  print('My name is ${name.toUpperCase()} and I am ${age + 5} years old.');

  String nme = "indian";
  int code=34;
  bool a = true;
  double b = 3.14;

  int? ax; // nullable int
  ax= null;
  ax = 100;
}
