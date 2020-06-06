import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:guardian_liveness/guardian_liveness.dart';

void main() {
  const MethodChannel channel = MethodChannel('guardian_liveness');

  TestWidgetsFlutterBinding.ensureInitialized();

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('isDeviceSupportLiveness', () async {
    expect(await GuardianLiveness.isDeviceSupportLiveness(), true,);
  });
}
