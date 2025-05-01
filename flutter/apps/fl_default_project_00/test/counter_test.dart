import 'package:fl_default_project_00/counter.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  group('Test start, increment, decrement', () {
    test('value should start at 0', () {
      expect(Counter().value, 0);
    });

    test('value should be incremented', () {
      final counter = Counter();

      counter.increment();
      print(counter.value);
      expect(counter.value, 1);
    });

    test('value should be decremented', () {
      final counter = Counter();

      counter.decrement();
      print(counter.value);
      expect(counter.value, -1);
    });
  });
}
