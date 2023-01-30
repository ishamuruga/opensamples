import 'package:flutter/material.dart';

import './question.dart';

// void main() {
//   runApp(MyApp());
// }

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<StatefulWidget> createState() {
    return _MyAppState();
  }
}

class _MyAppState extends State<MyApp> {
  var _index = 0;
  void _ansQuestion() {
    setState(() {
      _index++;
    });

    print(_index);
  }

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
            Question(animals[_index]),
            ElevatedButton(onPressed: _ansQuestion, child: Text("Answer 1")),
            ElevatedButton(onPressed: _ansQuestion, child: Text("Answer 2")),
            ElevatedButton(
                onPressed: () => print('Answer2 Choosen'),
                child: Text("Answer 3")),
          ]),
        ));
  }
}
