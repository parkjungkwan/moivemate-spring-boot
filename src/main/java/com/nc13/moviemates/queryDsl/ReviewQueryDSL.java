package com.nc13.moviemates.queryDsl;

import com.nc13.moviemates.component.model.MovieModel;
import com.nc13.moviemates.component.model.ReviewModel;
import com.nc13.moviemates.entity.MovieEntity;
import com.nc13.moviemates.entity.ReviewEntity;
import com.querydsl.core.Tuple;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface ReviewQueryDSL {
    List<ReviewEntity> getAll();
    ReviewEntity getById(Long id);
    List<MovieEntity> findWatchedMoviesByUserId(Long userId);
    Boolean exists(Long id);
    Long getRowCount();
    Long deleteMany(List<Long> reviewIdList);
    List<ReviewEntity> findAllByMovieId(Long movieId);
    List<String> findMovieTitlesByUserId(Long userId);
    List<ReviewEntity> getReviewsByWriterId(Long writerId);
    List<Map<String, Object>> findTop5MoviesWithLongestReview();
    List<Map<String, Object>> findReviewsWithUserImage(Long movieId);
    List<Map<String, Object>> findReviewsWithMovieByUserId(Long userId);
    Page<ReviewEntity> findAllPageByMovieId(Long movieId, Pageable pageable);
}