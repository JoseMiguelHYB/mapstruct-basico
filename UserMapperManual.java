
public class UserMapper {
    // Convierte una entidad a un modelo de dominio
    public static User toDomain(UserEntity userEntity) {
        if (userEntity == null) return null;
        return new User(
            userEntity.getId(),
            userEntity.getUsername(),
            userEntity.getEmail(),
            userEntity.getCreatedAt(),
            userEntity.getUpdatedAt()
        );
    }

    // Convierte un modelo de dominio a una entidad
    public static UserEntity toEntity(User user) {
        if (user == null) return null;
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setUsername(user.getUsername());
        entity.setEmail(user.getEmail());
        entity.setCreatedAt(user.getCreatedAt());
        entity.setUpdatedAt(user.getUpdatedAt());
        return entity;
    }

    // Convierte una lista de entidades a una lista de modelos de dominio
    public static List<User> toDomainList(List<UserEntity> userEntities) {
        if (userEntities == null) return null;
        return userEntities.stream()
                .map(UserMapper::toDomain)
                .collect(Collectors.toList());
    }

    // Convierte una lista de modelos de dominio a una lista de entidades
    public static List<UserEntity> toEntityList(List<User> users) {
        if (users == null) return null;
        return users.stream()
                .map(UserMapper::toEntity)
                .collect(Collectors.toList());
    }
}
