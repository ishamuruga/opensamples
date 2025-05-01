import 'dart:math';

import 'package:fl_default_project_00/utils/control-styles.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Manic Basha',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: MyScreen(),
    );
  }
}

class MyScreen extends StatefulWidget {
  const MyScreen({super.key});

  @override
  State<StatefulWidget> createState() {
    return _MyScreenState();
  }
}

class _MyScreenState extends State<MyScreen> {
  int _incrementValue = 0;
  int _ranDom = 0;

  void doIncrement() {
    setState(() {
      _incrementValue++;
      _ranDom = Random().nextInt(100);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Bombay Don'), backgroundColor: Colors.amber),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text('You have pushed the button this many times:'),
            Text(
              '$_incrementValue , $_ranDom',
              style: const TextStyle(
                fontSize: 16.0,
                fontWeight: FontWeight.normal,
              ),
              textDirection: TextDirection.ltr,
            ),
            ElevatedButton(
              style: raisedButtonStyle,
              onPressed: doIncrement,
              child: Text('Looks like a RaisedButton'),
            ),
          ],
        ),
      ),
    );
  }
}
