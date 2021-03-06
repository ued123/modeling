package com.example.display.service;

import com.example.display.fixture.DisplayFixture;
import com.example.display.repo.DisplayRepository;
import com.example.mongo.model.Display;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DisplayServiceImplTest {

    @Mock
    private DisplayRepository displayRepository;
    @InjectMocks
    private DisplayServiceImpl displayServiceImpl;

    @BeforeEach
    void setUp() {
        DisplayFixture.displayRepositoryStubbing(displayRepository);
    }

    @Test
    @DisplayName("DisplayService getDisplayDrinks 호출")
    public void getDrinkAllListTest() throws JsonProcessingException {

        List<Display> displayDrinkViewList = displayServiceImpl.getDisplayDrinks();
        assertEquals(3,displayDrinkViewList.size());
    }
}
