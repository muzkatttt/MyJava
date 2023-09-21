package sem1.homework;

public class Main {
    /*
    Задание 1. ** В классе Calculator создайте метод calculateDiscount,
    который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
    Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
    Если метод calculateDiscount получает недопустимые аргументы,
    он должен выбрасывать исключение ArithmeticException.
    Не забудьте написать тесты для проверки этого поведения.

    *Задание 2. (необязательное) *
    Мы хотим улучшить функциональность нашего интернет-магазина.
    Ваша задача - добавить два новых метода в класс Shop:
    Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
    Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
    Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
    (правильное количество продуктов, верное содержимое корзины).
    Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    Напишите тесты для проверки корректности работы метода sortProductsByPrice
    (проверьте правильность сортировки).
    Используйте класс Product для создания экземпляров продуктов и
    класс Shop для написания методов сортировки и тестов.

     def calculate(first_operand: int, second_operand: int, operator: str) -> int | float:
    match operator:
        case '+':
            result = first_operand + second_operand
        case '-':
            result = first_operand - second_operand
        case '*':
            result = first_operand * second_operand
        case '/':
            if second_operand != 0:
                result = first_operand / second_operand
            else:
                raise ArithmeticError("Division by zero is not possible")
        case _:
            raise ValueError("Unexpected value operator: " + operator)
    return result


def calculate_discount(purchase_amount: float, discount_amount: int) -> float:
    if discount_amount < 0:
        raise ArithmeticError("Discount can't be less then zero")
    elif discount_amount > 100:
        raise ArithmeticError("Discount can't be more then 100")

    return purchase_amount - discount_amount / 100 * purchase_amount

     */
}
