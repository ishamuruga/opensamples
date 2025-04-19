import 'package:fl_app_fb_security/ui/screens/login_screen.dart';
import 'package:flutter/material.dart';

class MainView extends StatefulWidget {
  const MainView({super.key});

  @override
  State<StatefulWidget> createState() {
    return _MainViewState();
  }
}

class _MainViewState extends State<MainView> {
  PageController controller = PageController(initialPage: 0);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: PageView.builder(
        itemCount: 3,
        controller: controller,
        physics: const NeverScrollableScrollPhysics(),
        itemBuilder: (context, index) {
          if (index == 0) {
            return LoginScreen(controller: controller);
          } else if (index == 1) {
            // return SingUpScreen(controller: controller);
          } else {
            // return VerifyScreen(controller: controller);
          }
        },
      ),
    );
  }
}
