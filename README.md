# Java w zastosowaniach produkcyjnych

## Zadanie 2 - Filtrowanie na modłę Mavena w Gradle'u

Skrypt budujący build.gradle pozwala na przełączenie profili, a na podstawie wybranego profilu
podmienia zawartość pliku db.properties na właściwe dla niego dane.

Wywołanie:

- gradle [run/build/jar] -Pprofile=[dev/prod/test] &emsp; uruchamia/buduje/pakuje do pliku jar projekt z wybranym profilem

Profile:

- dev - development - profil rozwojowy
- prod - production - profil produkcyjny
- test - testing - profil testerski

W przypadku niepodania profilu ustawiany jest domyślny, zdefiniowany w build.gradle(dev).
