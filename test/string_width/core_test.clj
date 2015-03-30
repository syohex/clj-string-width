(ns string-width.core-test
  (:require [clojure.test :refer :all]
            [string-width.core :refer :all]))

(deftest character-width-test
  (testing "width of character"
    (is (= (character-width \世) 2))
    (is (= (character-width \界) 2))
    (is (= (character-width \ｾ) 1))
    (is (= (character-width \ｶ) 1))
    (is (= (character-width \ｲ) 1))
    (is (= (character-width \★) 2))
    (is (= (character-width \u0000) 0))
    (is (= (character-width \u0001) 1))))

(deftest string-width-test
  (testing "Total width of string"
    (is (= (string-width "■㈱の世界①") 12))
    (is (= (string-width "スター☆") 8))))
