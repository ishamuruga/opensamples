import 'package:flutter/material.dart';

import 'package:flutter/material.dart';

class Login extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return LoginState();
  }
}

class LoginState extends State<Login> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Colors.yellow,
        appBar: AppBar(
          title: Text("eMarket Place"),
        ),
        body: SingleChildScrollView(
            child: Column(
          children: <Widget>[
            Padding(
              padding: EdgeInsets.only(top: 60.0),
              child: Center(
                  child: Container(
                width: 200,
                height: 150,
                child: Image.asset('./asset/logo.png'),
              )),
            )
          ],
        )));
  }
}
