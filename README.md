# Java_Seminar6
Вся домашняя работа лежит в пакете 

## [Homework](https://github.com/AlexeyDmitrich/Java_Seminar6/tree/master/src/Homework)

По порядку: 

### [Класс Laptop:](https://github.com/AlexeyDmitrich/Java_Seminar6/blob/master/src/Homework/Laptop.java)
Класс ноутбуков. Можно сказать - технические нормативы для завода-изготовителя.

### [Класс Factory:](https://github.com/AlexeyDmitrich/Java_Seminar6/blob/master/src/Homework/Factory.java)
Собственно, именно в этом классе ноутбуки выходят в тираж: единственное поле класса - это размер заказа. 
По этому размеру создается массив, который заполняется генерируемыми ноутбуками. Как легко догадаться - 
генерируются они внутри этого же класса, с помощью рандомайзера. Класс имеет один полезный снаружи метод- *fillStock*,
который возвращает массив, заполненный ноутбуками.

### [Класс Marketplace:](https://github.com/AlexeyDmitrich/Java_Seminar6/blob/master/src/Homework/Marketplace.java)
В нем реализуется логика магазина - из этого класса совершаем заказ на фабрику в объеме 10 шт. Этого должно быть достаточно, 
чтобы поиграться с фильтрами. Для этого реализовано вполне человеческое меню. А вот для тех, кому нужно нечто особенное,
есть более тонкий метод (его тоже можно вызвать из меню). Он закажет с завода сразу 256 устройств и будет их проверять на
соответствие сразу всем требованиям заказчика. Если подходящей модели не найдется - с фабрики будут заказаны уже 512 следующих устройств, 
а пользователю придется повторить ввод требований. в следующий раз размер заказа будет увеличен еще вдвое, и так далее. 
Если ноутбук, который нужен пользователю, вообще может существовать - рано 
или поздно он найдется.