import 'package:flutter/material.dart';

class Question extends StatelessWidget {
  String text = "";

  //Question({super.key, required this.text});
  //Question(this.text, {super.key});
  Question(this.text);

  @override
  Widget build(BuildContext context) {
    return Text(text);
  }
}
