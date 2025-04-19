// import 'package:firebase_core/firebase_core.dart';
import 'package:fl_app_fb_security/ui/main_view.dart';
import 'package:flutter/material.dart';

void main() async {
  // WidgetsFlutterBinding.ensureInitialized();
  // await Firebase.initializeApp();
  runApp(MyAppSecurity());
}

class MyAppSecurity extends StatelessWidget {
  const MyAppSecurity({super.key});

  @override
  Widget build(BuildContext ontext) {
    return MaterialApp(
      debugShowCheckedModeBanner: true,
      theme: ThemeData(appBarTheme: AppBarTheme(color: Colors.amber)),
      darkTheme: ThemeData.light(),
      home: MainView(),
    );
  }
}
