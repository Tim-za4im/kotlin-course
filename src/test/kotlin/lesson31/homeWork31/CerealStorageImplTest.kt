package lesson31.homeWork31
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CerealStorageImplTest{


        private val cerealStorage = CerealStorageImpl(10f, 50f)

        @Test
        fun testAddCereal() {
            // Проверка добавления положительной величины
            val remaining = cerealStorage.addCereal(Cereal.BUCKWHEAT, 8f)
            assertEquals(2f, remaining, 0.01f)

            // Проверка исключения при добавлении отрицательного количества
            assertThrows<IllegalArgumentException> {
                cerealStorage.addCereal(Cereal.RICE, -1f)
            }

            // Проверка исключения при заполнении хранилища
            cerealStorage.addCereal(Cereal.MILLET, 9f)
            assertThrows<IllegalStateException> {
                cerealStorage.addCereal(Cereal.PEAS, 4f)
            }
        }

        @Test
        fun testGetCereal() {
            // Добавление крупы для тестирования
            cerealStorage.addCereal(Cereal.BUCKWHEAT, 6f)

            // Получение положительного количества
            val received = cerealStorage.getCereal(Cereal.BUCKWHEAT, 3f)
            assertEquals(3f, received, 0.01f)

            // Получение остатка
            val remainder = cerealStorage.getCereal(Cereal.BUCKWHEAT, 7f)
            assertEquals(3f, remainder, 0.01f)

            // Проверка исключения при получении отрицательного количества
            assertThrows<IllegalArgumentException> {
                cerealStorage.getCereal(Cereal.RICE, -1f)
            }
        }

        @Test
        fun testRemoveContainer() {
            // Добавляем крупу в контейнер
            cerealStorage.addCereal(Cereal.BUCKWHEAT, 6f)

            // Пытаемся удалить непустой контейнер
            val result = cerealStorage.removeContainer(Cereal.BUCKWHEAT)
            assertEquals(false, result)

            // Убираем всю крупу из контейнера
            cerealStorage.getCereal(Cereal.BUCKWHEAT, 6f)

            // Удаляем теперь уже пустой контейнер
            val success = cerealStorage.removeContainer(Cereal.BUCKWHEAT)
            assertEquals(true, success)
        }

        @Test
        fun testGetAmount() {
            // Добавляем крупу в контейнер
            cerealStorage.addCereal(Cereal.BUCKWHEAT, 6f)

            // Проверяем количество крупы в контейнере
            val amount = cerealStorage.getAmount(Cereal.BUCKWHEAT)
            assertEquals(6f, amount, 0.01f)

            // Уменьшаем количество крупы
            cerealStorage.getCereal(Cereal.BUCKWHEAT, 3f)

            // Снова проверяем количество
            val newAmount = cerealStorage.getAmount(Cereal.BUCKWHEAT)
            assertEquals(3f, newAmount, 0.01f)
        }

        @Test
        fun testGetSpace() {
            // Добавляем крупу в контейнер
            cerealStorage.addCereal(Cereal.BUCKWHEAT, 6f)

            // Проверяем свободное пространство
            val space = cerealStorage.getSpace(Cereal.BUCKWHEAT)
            assertEquals(4f, space, 0.01f)

            // Увеличиваем количество крупы
            cerealStorage.addCereal(Cereal.BUCKWHEAT, 2f)

            // Снова проверяем свободное пространство
            val newSpace = cerealStorage.getSpace(Cereal.BUCKWHEAT)
            assertEquals(2f, newSpace, 0.01f)
        }

        @Test
        fun testToString() {
            // Проверим текстовое представление
            val stringRepresentation = cerealStorage.toString()
            assertEquals("CerealStorageImpl(containerCapacity=10.0, storageCapacity=50.0)", stringRepresentation)
        }
    }


