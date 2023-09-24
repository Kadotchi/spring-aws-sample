package kadotchi.sample.training.repository;

import java.util.List;

import kadotchi.sample.training.entity.Training;

public interface TrainingRepository {
    Training selectById(String id);

    List<Training> selectAll();

    boolean update(Training training);

    void insert(Training training);

    boolean delete(String id);
}
