import 'package:flutter/material.dart';

// void main() {
//   runApp(MyApp());
// }

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var animals = ['tiger', 'lion', 'mc\'abbe'];
    // TODO: implement build
    return MaterialApp(
        title: 'Flutter Demo',
        home: Scaffold(
          appBar: AppBar(
            title: Text('My First Title'),
          ),
          body: Column(children: [
            Text("SUper Star1"),
            ElevatedButton(onPressed: null, child: Text("Answer 1")),
            ElevatedButton(onPressed: null, child: Text("Answer 2")),
            ElevatedButton(onPressed: null, child: Text("Answer 3")),
          ]),
        ));
  }
}
