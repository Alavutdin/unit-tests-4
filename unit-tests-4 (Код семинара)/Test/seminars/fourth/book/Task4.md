# 1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

Заглушка выступает в качестве небольшого фрагмента кода, который заменяет
другой компонент во время тестирования. Одним из ключевых преимуществ
использования заглушки является их способность постоянно возвращать результаты,
что упрощает написание тестов. Даже если другие компоненты еще не полностью
функциональны, мы по-прежнему можем выполнять тесты с помощью заглушки.
Использование заглушек повышает автономность теста и его гибкость.(так
же экономит память, заменяя реальные объекты на фейк, высокая скорость работы)

# 2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

С помощью **mock** в нем есть функция **assert_called()** Утверждение, что мок вызывался хоть раз.
Mock (Имитация) заменяет реальный компонент, от которого
зависит тестируемая система. Позволяет тесту проверять вывод


# 3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

**Stub (Заглушки)** — представляет собой объекты, также называемые заглушками, которые
заменяют реальный компонент, от которого зависит тестируемая система,для которого
задается готовый ответ на вызов

# 4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?


**Fake (Подделка)** небольшие фрагменты кода, контролируемые тестами, которые имитируют поведение фактических частей, которые они заменяют. (Face заменяет функциональность вызываемого компонента альтернативной реализацией)