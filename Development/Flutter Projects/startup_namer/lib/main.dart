// Copyright 2018 The Flutter team. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var center = Center(
              child: Text('Hello'),
            );
        return MaterialApp(
          title: 'Welcome to Flutter',
          home: Scaffold(
            appBar: AppBar(
              title: Text('Welcome to Flutter'),
            ),
            body: center,
      ),
    );
  }
}
// class RandomWordsState extends State<RandomWords> {
//   @override
//   Widget build(BuildContext context) {
//     // TODO: implement build
//     final wordPair = WordPair.random();
//     return Text(wordPair.asPascalCase);
//   }
//   }
//   // TODO Add build() method

// class RandomWords extends StatefulWidget {
//   @override
//   State<StatefulWidget> createState() {
//     // TODO: implement createState
//   }

// }