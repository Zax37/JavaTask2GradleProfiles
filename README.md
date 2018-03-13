# Java w zastosowaniach produkcyjnych

## Zadanie 2 - Filtrowanie na modłę Mavena w Gradle'u

Skrypt budujący build.gradle pozwala na przełączenie profili, a na podstawie wybranego profilu
podmienia zawartość pliku db.properties na właściwe dla niego dane.

Wywołania:

- gradle build -Pprofile=dev  &emsp; &emsp;: buduje projekt z profilem dev

- gradle build -Pprofile=prod &emsp;&emsp;: buduje projekt z profilem prod

- gradle build -Pprofile=test &emsp; &emsp;: buduje projekt z profilem test

W przypadku niepodania profilu ustawiany jest domyślny, zdefiniowany w build.gradle(dev).
