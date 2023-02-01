import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import './Login.dart';

void main() {
  runApp(MainApp());
}

class MainApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(debugShowCheckedModeBanner: false, home: Login());
  }
}
