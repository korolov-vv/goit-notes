package ua.goit.goitnotes.model.entity;

import lombok.Getter;
import lombok.Setter;
import ua.goit.goitnotes.model.entity.Enums.AccessType;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "notes")
@Getter
@Setter
public class NoteDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "access_type")
    private AccessType accessType;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public NoteDAO(UUID id, String title, String content, AccessType accessType, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.accessType = accessType;
        this.user = user;
    }

    public NoteDAO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoteDAO)) return false;
        NoteDAO noteDAO = (NoteDAO) o;
        return id.equals(noteDAO.id) && title.equals(noteDAO.title) && content.equals(noteDAO.content) && accessType == noteDAO.accessType && user.equals(noteDAO.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, accessType);
    }
}