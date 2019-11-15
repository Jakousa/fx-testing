# Java FX -projektin testausta TestFX-kirjastolla

Koodi suoritetaan komennolla _./gradlew run_

Testit suoritetaan komennolla _./gradlew test_

## testaaminen junitilla

Tämän repositorion [master](https://github.com/mluukkai/fx-testing)-branchissa JavaFX-projektia testataan normaalin [TestFX](https://github.com/mluukkai/fx-testing/blob/master/src/test/java/ohtu/ExampleTest.java)-testin avulla. 

Konfiguraatio toimii Circlessä [![Build Status](https://travis-ci.org/mluukkai/fx-testing.svg?branch=master)](https://travis-ci.org/mluukkai/fx-testing)

## cucumber

Branchissa [cucumber](https://github.com/mluukkai/fx-testing/tree/cucumber) projektia testataan Cucumberin ja TestFX:n yhdistelmällä. Yhdistelmä ei ole varsinaisesti vielä tuettu, mutta näyttää toimivan, jos cucumber-testien yhteyteen luodaan ennen cucumberin steppejä suoritettava [TestFX](https://github.com/mluukkai/fx-testing/blob/cucumber/src/test/java/ohtu/AaaTest.java)-testi. 

Myös cucumber-testit toimivat Circlessä [![Build Status](https://travis-ci.org/mluukkai/fx-testing.svg?branch=cucumber)](https://travis-ci.org/mluukkai/fx-testing)
