import org.junit.jupiter.api.Test;
import statiaticsjavacodecoverage.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

  @Test
  void shouldFindMax() {
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    StatisticsService service = new StatisticsService();
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    assertEquals(expected, actual);
  }

  @Test
  void shouldFindMax2() {
    long[] incomesInBillions = {11, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    StatisticsService service = new StatisticsService();
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    assertEquals(expected, actual);
  }
}

