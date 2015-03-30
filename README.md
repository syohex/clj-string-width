# string-width

This is Clojure port of [go-runewidth](https://github.com/mattn/go-runewidth).

## Usage

```clojure
(require '[string-width])

(string-width/char-width \a)  ; => 1
(string-width/char-width \あ) ; => 2

(string-width/string-width "あいうえお") ; => 10
```

## License

Copyright © 2015 Syohei YOSHIDA

Distributed under the Eclipse Public License either version 1.0 or any later version.
