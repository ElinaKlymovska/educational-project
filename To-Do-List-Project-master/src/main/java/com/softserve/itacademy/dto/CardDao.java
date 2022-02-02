package com.softserve.itacademy.dto;

import spd.trello.domain.*;
import test.app.DataBaseConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CardDao {

    private static Connection connection;

    static {
        try {
            connection = DataBaseConfiguration.getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/*    public List<Card> allCards() {
        List<Card> cards = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cards");
            while (resultSet.next()) {
                Card card = new Card();
                card.setId((UUID) resultSet.getObject("id"));
                card.setName(resultSet.getString("name"));
                card.setDescription(resultSet.getString("description"));
                card.setArchived(resultSet.getBoolean("archived"));
                card.setCreatedBy(resultSet.getString("createdBy"));
                card.setUpdatedBy(resultSet.getString("updatedBy"));
                card.setCreatedDate((LocalDateTime) resultSet.getObject("createdDate"));
                card.setUpdatedDate((LocalDateTime) resultSet.getObject("updatedDate"));
                cards.add(card);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cards;
    }*/

/*    public void save(Card card) {
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO cards VALUES(" + card.getId() + ",'" + card.getName() +
                    "'," + card.getDescription() + ",'" + card.getArchived() + ",'" + card.getReminder().getId() +
                    "'," + card.getC() + ",'" + card.getArchived() + "')";


            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
/*    id          UUID PRIMARY KEY,
    name        VARCHAR(225) NOT NULL,
    description VARCHAR(225) NOT NULL,
    archived    boolean      NOT NULL,
            reminder_id UUID REFERENCES reminders (id),
            cardlist_id UUID REFERENCES cardlists (id),

            createdBy   VARCHAR(225) NOT NULL,
            updatedBy   VARCHAR(225) NOT NULL,
            createdDate timestamp without time zone NOT NULL,
            updatedDate timestamp without time zone NOT NULL*/
