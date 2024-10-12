//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartUtils;
//import org.jfree.chart.JFreeChart;
//import org.jfree.data.category.DefaultCategoryDataset;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class Chart {
//
//    @Autowired
//    private StudentService studentService;
//
//    public String generateBarChart() throws IOException {
        // Создаем набор данных для гистограммы
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Получаем данные из базы данных
//        List<Object[]> playData = studentService.countByDayChart();
//
//        // Заполняем набор данных
//        for (Object[] data : playData) {
//            String date = data[0].toString(); // Преобразуем дату в строку
//            Long count = (Long) data[1]; // Количество спектаклей
//            dataset.addValue(count, "Количество", date); // Добавляем в набор данных
//        }
//
//        // Создаем гистограмму
//        JFreeChart chart = ChartFactory.createBarChart(
//                "Количество спектаклей по дням", // Заголовок
//                "Даты", // Ось X
//                "Количество спектаклей", // Ось Y
//                dataset
//        );
//
//        // Путь к файлу для сохранения изображения
//        String filePath = "src/main/resources/static/images/bar_chart.png";
//
//        // Сохраняем изображение как PNG
//        ChartUtils.saveChartAsPNG(new File(filePath), chart, 800, 600);
//
//        // Возвращаем путь к изображению
//        return "/images/bar_chart.png";
//    }
//}
