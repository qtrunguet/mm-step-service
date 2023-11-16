# System Design

## Components:

1. **Redis Sorted Set for Daily Ranking Board:**
    - Utilizing Redis Sorted Set to cache the daily ranking board efficiently.

2. **Kafka for Daily Step Changes:**
    - Leveraging Kafka to process and handle changes in daily step counts.

3. **Database Design:**

   ### Tables:

   #### 1. USER
    - `user_id`: Unique identifier for each user.
    - `user_name`: User's name.
    - (Add other relevant user attributes here)

   #### 2. DAILY_STEP
    - `user_id`: Foreign key referencing the USER table.
    - `step_id`: Unique identifier for each daily step entry.
    - `number_step`: Number of steps taken.
    - `date`: Date of the recorded step count.

   #### 3. WEEK_STEP
    - `user_id`: Unique identifier for each user.
    - `number_step`: Total number of steps for the week.
    - `week_date`: Date corresponding to the week.

   #### 4. MONTH_STEP
    - `user_id`: Unique identifier for each user.
    - `number_step`: Total number of steps for the month.
    - `month_date`: Date corresponding to the month.

---

**Note:** Ensure appropriate indexing, relationships, and constraints are applied to maintain data integrity and optimize query performance.

---

## Flow: