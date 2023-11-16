package bamboo.repository;

import bamboo.entity.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoticeRepository extends JpaRepository<NoticeEntity, Long> {

    Optional<List<NoticeEntity>> findByIdIn(List<Long> idList);
}

