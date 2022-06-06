# ZPAM_Company
Kolokwium zaliczeniowe

Zadanie 1.
Napisz klasę wyliczeniową Department, która w konstruktorze posiada nazwę działu. Niech posiada wartości HR, MARKETING, IT.

Zadanie 2.
Napisz klasę Employee, która w konstruktorze domyślnym przyjmować będzie PESEL (String), imię, nazwisko, dział (jako typ Department).
W konstruktorze wtórnym niech przyjmuje PESEL, imię, nazwisko, dział (jako Int). Niech dział wyznaczony będzie na podstawie liczby 0 to HR, 1 to Marketing, jeśli inna liczba to IT. Niech klasa posiada przysłoniętą metodę toString, która wyświetla imię, nazwisko i dział.

Zadanie 3.
Napisz klasę Company, która jako własność posiadać będzie prywatną mutowalną listę obiektów typu Employee. Niech klasa posiada funkcje do dodawania pracowników do listy, która jako argument przyjmuje obiekt klasy Employee. Przy dodawaniu pracowników, niech sprawdza, czy pracownik o podanym PESELu istnieje już na liście, jeśli istnieje, niech wyświetla w konsoli komunikat, że taki pracownik już istnieje i nie dodaje go ponownie. W przeciwnym wypadku niech doda pracownika do listy. Niech klasa posiada metodę do usuwania pracowników z listy, która przyjmuje jako argument PESEL ina tej podstawie usuwa pracownika z listy. Jeśli takiego pracownika nie ma, wyświetl komunikat w konsoli. Niech klasa posiada funkcję do wypisywania listy pracowników w konsoli. Niech klasa posiada funkcję do zbierania statystyk zatrudnienia. Funkcja ta zwracać ma mapę, gdzie kluczem jest Department, a wartością liczba osób pracujących w danym dziale.

Zadanie 4. 
A) Napisz własny wyjątek IcorrectNumberInputException, który przyjmować w konstruktorze będzie message. Napisz własny wyjątek LengthException, który przyjmować w konstruktorze będzie message.
B) Napisz funkcję, która służyć będzie do sprawdzania, czy podany PESEL jest poprawny, zwracającą typ Boolean. Sprawdzanie poprawności umieść w instrukcji try…catch. Jeśli jakikolwiek wyjątek zostanie „złapany” zwróć false (jak w przykładzie poniżej)
W przypadku, gdy podany łańcuch znaków będzie się składał z czegoś innego niż z cyfr wyrzuć własny
wyjątek IcorrectNumberInputException. Jeśli długość peselu składającego się z liczb będzie niepoprawna wyrzuć własny wyjątek LengthException

Zadanie 5.
Napisz funkcję main(). Stwórz w niej obiekt klasy Company. Następnie pobierając dane od użytkownika twórz pracowników i dodawaj ich do listy w klasie
Company.
Niech tworzenie pracowników odbywa się w pętli while.
Zapytaj (w pętli), czy użytkownik chce stworzyć pracownika „Do you want to create an employee?
Y/N”, jeśli użytkownik wpisze Y prosimy go o podanie danych użytkownika (jak niżej), w przeciwnym
wypadku przerywamy działanie pętli.
Poproś o podanie PESELu (tymczasowo bez sprawdzania poprawności) i przypisz wartość do
zmiennej.
Poproś o podanie imienia (tymczasowo bez sprawdzania poprawności) i przypisz wartość do
zmiennej.
Poproś o podanie nazwiska (tymczasowo bez sprawdzania poprawności) i przypisz wartość do
zmiennej.
Poproś o podanie działu (tymczasowo bez sprawdzania poprawności) i przypisz wartość do zmiennej.
Sprawdź poprawność podanych przez użytkownika danych. Jeśli którakolwiek z podanych danych
będzie niepoprawna wypisz w konsoli, że nie udało się poprawnie utworzyć użytkownika. Jeśli
wszystkie dane są poprawne tworzymy użytkownika i dodajemy do listy w obiekcie klasy Company.
Poprawność PESELu sprawdzamy za pomocą funkcji z zadania 4B, imię i nazwisko nie może być
pustym Stringiem, dział musi być wyrażony za pomocą liczby 0, czyli HR, 1, czyli Marketing lub 2, czyli
IT.
Po wyjściu z pętli wyświetl listę pracowników. Przetestuj działanie funkcji usuwania pracownika z
listy, a także wyświetl wynik funkcji zwracającej ilość osób zatrudnionych w danym dziale.
